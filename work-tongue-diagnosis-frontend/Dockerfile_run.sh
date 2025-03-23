#!/bin/bash
# ./Dockerfile_run.sh
docker container stop work-tongue-diagnosis-frontend || true
docker container rm work-tongue-diagnosis-frontend || true
docker run -d --restart=always --network host --name work-tongue-diagnosis-frontend work-tongue-diagnosis-frontend:0.0.1
docker container logs work-tongue-diagnosis-frontend
docker container ls -a
