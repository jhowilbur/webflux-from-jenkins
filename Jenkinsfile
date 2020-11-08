pipeline {
    agent any
    environment {
        PATH = "/opt/apache-maven-3.6.1/bin:$PATH"
    }
    stages {
        stage('Build') {
            steps {
               echo 'This is a minimal pipeline.'
            }
        }
//         stage("clone code"){
//             steps{
//                git credentialsId: 'git_credentials', url: 'https://github.com/jhowilbur/webflux-from-jenkins.git'
//             }
//         }
        stage("build code"){
            steps{
              sh "apt install maven"
            }
        }
        stage("build code"){
            steps{
              sh "mvn clean install"
            }
        }
    }

}