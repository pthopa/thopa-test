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
            bat 'docker-compose up -f \Apps\workspace\thopa-test\docker-compose.yml'
        }
    }
   }
}
