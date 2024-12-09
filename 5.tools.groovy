pipeline {
    agent {
        label 'java'
    }
    tools {
        maven 'maven3.8.8'
    }
    stages {
        stage ('tools') {
            steps {
                echo "Hello Prakkaash Kannan Jenkins world"
                sh " mvn --version"

            }
        }
    }
}