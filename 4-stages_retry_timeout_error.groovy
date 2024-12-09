pipeline {
    agent any
    stages {
        stage ('Build') {
            steps {
                retry (3) {
                    echo "Welcome to Jenkins Pipeline"
                    error "Test this for retry block"
                }
            echo "After 3 retrys"

                
            }
        }
    }
}

//Timeout practices
pipeline {
    agent any
    stages {
        stage ('Approval time out ') {
            steps {
                timeout (time:5, unit: 'SECONDS')
                {
                    echo "sleeping for 60 seconds"
                    sleep 60
                }

            }
        }
    }
}