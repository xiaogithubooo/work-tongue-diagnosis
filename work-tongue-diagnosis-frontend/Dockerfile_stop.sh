#!/bin/bash
# ./Dockerfile_stop.sh
docker container stop work-tongue-diagnosis-backend || true
docker container rm work-tongue-diagnosis-backend || true
docker container logs work-tongue-diagnosis-frontend
docker container ls -a
