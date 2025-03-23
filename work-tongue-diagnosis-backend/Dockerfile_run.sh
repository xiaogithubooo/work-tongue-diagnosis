#!/bin/bash
# 镜像运行脚本
#
# @author <a href="https://github.com/xiaogithuboo">limou3434</a>
sudo docker container stop work-tongue-diagnosis-backend || true
sudo docker container rm work-tongue-diagnosis-backend || true
sudo docker run -d --restart=always --network host --name work-tongue-diagnosis-backend work-tongue-diagnosis-backend:0.0.1
sudo docker container logs work-tongue-diagnosis-backend
sudo docker container ls -a
echo "脚本结束"
