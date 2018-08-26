pipeline {
  agent any
  tools {
    maven 'Maven 3.5.4'
    jdk  'JDK 8'
    org.jenkinsci.plugins.docker.commons.tools.DockerTool 'Docker'
  }
 
  stages {
    stage('checkout project') {
            steps {
              checkout scm
            }
    } 
  
    stage('runTests') {
        steps {
            sh 'docker-compose up --abort-on-container-exit --exit-code-from seleniumtests'
        }
    }
   }
}
