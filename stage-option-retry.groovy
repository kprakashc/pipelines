pipeline {
    agent any 
    stages {
        stage ('Build') {
            options {
                retry(3)
            }
            
            steps {
                echo "Before Setting current build to failure"
                script{
                    currentBuild.result = 'FAILURE'
                }
                echo "After Setting current build to failure"
            }

        }
    }
    
}