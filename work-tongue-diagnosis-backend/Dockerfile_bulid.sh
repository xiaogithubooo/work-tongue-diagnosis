#!/bin/bash
# 镜像编译脚本
#
# @author <a href="https://github.com/xiaogithuboo">limou3434</a>
java -Dmaven.multiModuleProjectDirectory=/home/ljp/git/work-tongue-diagnosis/work-tongue-diagnosis-backend -Djansi.passthrough=true -Dmaven.home=/snap/intellij-idea-ultimate/583/plugins/maven/lib/maven3 -Dclassworlds.conf=/snap/intellij-idea-ultimate/583/plugins/maven/lib/maven3/bin/m2.conf -Dmaven.ext.class.path=/snap/intellij-idea-ultimate/583/plugins/maven/lib/maven-event-listener.jar -javaagent:/snap/intellij-idea-ultimate/583/lib/idea_rt.jar=37007 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /snap/intellij-idea-ultimate/583/plugins/maven/lib/maven3/boot/plexus-classworlds-2.8.0.jar:/snap/intellij-idea-ultimate/583/plugins/maven/lib/maven3/boot/plexus-classworlds.license org.codehaus.classworlds.Launcher -Didea.version=2024.3.4.1 package
sudo docker build -t work-tongue-diagnosis-backend:0.0.1 .
echo "脚本结束"
