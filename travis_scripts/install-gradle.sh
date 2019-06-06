#!/bin/bash
#install gradle 5.0 (default 4.0)
wget https://services.gradle.org/distributions/gradle-5.0-bin.zip -P /tmp
sudo unzip -d /opt/gradle /tmp/gradle-*.zip
ls /opt/gradle/gradle-5.0
echo $GRADLE_HOME
export GRADLE_HOME=/opt/gradle/gradle-5.0
export PATH=$GRADLE_HOME/bin:$PATH
source ~/.bashrc
echo $GRADLE_HOME
gradle -v