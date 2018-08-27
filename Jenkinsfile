pipeline {
  agent any
  tools {
    maven 'Maven 3.5.4'
    jdk  'JDK 8'
  }
 
  stages {
    stage('checkout project') {
        steps {
              step([$class:'DockerComposeBuilder', dockerComposeFile:'/var/jenkins_home/workspace/thopa-test/docker-compose.yml', useCustomDockerComposeFile:true ])
        }
    }
   }
}
