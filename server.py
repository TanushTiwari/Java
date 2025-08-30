#!/usr/bin/env python3
"""
Simple HTTP server for DSA Portal
Production-ready version with local file serving
"""

import http.server
import socketserver
import os
import sys
import webbrowser
import time
import urllib.parse
from pathlib import Path

# Configuration
PORT = 8080
HOST = "localhost"
ALPHA5_PATH = Path(__file__).parent.parent / "ALPHA5"

class CustomHTTPRequestHandler(http.server.SimpleHTTPRequestHandler):
    """Custom handler with API endpoints and CORS support"""
    
    def end_headers(self):
        # Add CORS headers for development
        self.send_header('Access-Control-Allow-Origin', '*')
        self.send_header('Access-Control-Allow-Methods', 'GET, POST, OPTIONS')
        self.send_header('Access-Control-Allow-Headers', 'Content-Type')
        super().end_headers()
    
    def do_GET(self):
        """Handle GET requests with API endpoints"""
        if self.path == '/':
            self.path = '/index.html'
        elif self.path.startswith('/api/code/'):
            self.serve_code_file()
            return
        return super().do_GET()
    
    def serve_code_file(self):
        """Serve Java code files from ALPHA5 directory"""
        try:
            # Extract file path from URL
            file_path = self.path[10:]  # Remove '/api/code/'
            file_path = urllib.parse.unquote(file_path)
            
            # Construct full path
            full_path = ALPHA5_PATH / file_path
            
            # Security check - ensure file is within ALPHA5 directory
            if not str(full_path.resolve()).startswith(str(ALPHA5_PATH.resolve())):
                self.send_error(403, "Access denied")
                return
            
            # Check if file exists
            if not full_path.exists():
                self.send_error(404, f"File not found: {file_path}")
                return
            
            # Read and serve file content
            with open(full_path, 'r', encoding='utf-8') as f:
                content = f.read()
            
            self.send_response(200)
            self.send_header('Content-Type', 'text/plain; charset=utf-8')
            self.end_headers()
            self.wfile.write(content.encode('utf-8'))
            
        except Exception as e:
            self.send_error(500, f"Server error: {str(e)}")
    
    def log_message(self, format, *args):
        """Custom logging with timestamps"""
        timestamp = time.strftime('[%Y-%m-%d %H:%M:%S]')
        print(f"{timestamp} {format % args}")

def find_free_port(start_port=8080, max_attempts=10):
    """Find a free port starting from start_port"""
    import socket
    for port in range(start_port, start_port + max_attempts):
        try:
            with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
                s.bind((HOST, port))
                return port
        except OSError:
            continue
    raise OSError(f"No free port found in range {start_port}-{start_port + max_attempts}")

def main():
    """Main server function"""
    # Change to the portal directory
    portal_dir = Path(__file__).parent
    os.chdir(portal_dir)
    
    print("🚀 DSA Portal Server")
    print("=" * 50)
    print(f"📂 Portal directory: {portal_dir}")
    print(f"📚 ALPHA5 directory: {ALPHA5_PATH}")
    print(f"✅ ALPHA5 exists: {ALPHA5_PATH.exists()}")
    print()
    
    try:
        # Find available port
        port = find_free_port(PORT)
        
        # Create server
        with socketserver.TCPServer((HOST, port), CustomHTTPRequestHandler) as httpd:
            server_url = f"http://{HOST}:{port}"
            
            print(f"🌐 Server running at: {server_url}")
            print(f"📱 Local access: http://localhost:{port}")
            print("=" * 50)
            print("Press Ctrl+C to stop the server")
            print()
            
            # Open browser automatically
            try:
                webbrowser.open(server_url)
                print("✅ Browser opened automatically")
            except Exception as e:
                print(f"⚠️  Could not open browser automatically: {e}")
                print(f"Please open {server_url} manually")
            
            print()
            
            # Start serving
            httpd.serve_forever()
            
    except KeyboardInterrupt:
        print("\n🛑 Server stopped by user")
        sys.exit(0)
    except OSError as e:
        print(f"❌ Server error: {e}")
        print("Try running with a different port or check if another server is running")
        sys.exit(1)
    except Exception as e:
        print(f"❌ Unexpected error: {e}")
        sys.exit(1)

if __name__ == "__main__":
    main()
