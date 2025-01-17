pipeline {
    agent any
    triggers { cron('H/10 14 * * 4') }
    options { timeout(time: 5) }
    parameters {
        booleanParam(name: 'DEBUG_BUILD', defaultValue: true, 
        description: 'Is it the debug build?')
    }
    stages{
        stage('Example') {
            environment { Name = 'SriRam' }
            // logRotator(-1, 2)
            when { expression { return params.DEBUG_BUILD } }
            steps {
                echo "Hello from $NAME"
                script {
                    def browsers = ['chrome', 'firefox']
                    for (int i = 0; i < browsers.size(); ++i) {
                        echo "Testing the ${browsers[i]} browser."
                    }
                }
            }
        }
    }
}