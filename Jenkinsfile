pipeline {
  agent any
  tools {
    maven 'Maven 3.5.4'
    jdk  'JDK 8'
  }
 
  stages {
    stage('checkout project') {
            steps {
              step([$class:'DockerComposeBuilder', dockerComposeFile:'./docker-compose.yml'])
        }
    }
   }
}
