pipeline {
  agent any

  stages {
     stage('checkout project') {
            steps {
              checkout scm
            }
    } 
  
    stage('runTests') {
        steps {
            sh 'curl -L https://github.com/docker/compose/releases/download/1.22.0/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose'
            sh 'chmod +x /usr/local/bin/docker-compose'
            sh 'docker-compose up'
        }
    }
   }
}
