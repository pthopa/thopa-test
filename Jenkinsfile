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
            sh 'docker-compose up -f \Apps\workspace\thopa-test\docker-compose.yml'  
        }
    }
   }
}
