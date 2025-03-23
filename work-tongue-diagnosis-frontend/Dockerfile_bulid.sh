#!/bin/bash
# Dockerfile_build.sh
npm install
npm run build
npm run package
docker build -t work-tongue-diagnosis-frontend:0.0.1 .
