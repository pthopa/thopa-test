pipeline {
  agent any

  stages {
     stage('delete target dir') {
        steps {  
                dir('/var/lib/jenkins/workspace/verfut-test/target') {
                   deleteDir()
                }
        } 
     }

     stage('checkout project') {
            steps {
              checkout scm
            }
    } 
  
    stage('runTests') {
        steps {
            sh 'sudo curl -L https://github.com/docker/compose/releases/download/1.22.0/docker-compose-$(uname -s)-$(uname -m) -o /usr/local/bin/docker-compose'
            sh 'sudo chmod +x /usr/local/bin/docker-compose'
            sh '/usr/local/bin/docker-compose up --abort-on-container-exit --exit-code-from seleniumtests'
        }
    }
   }
  post {
            success {
                 cucumber '**/target/*.json'
             }

             failure {
                cucumber '**/target/*.json'

            }
  }
}
