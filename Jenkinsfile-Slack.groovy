node {
    stage("Bulding"){
        echo 'Bulding..'
    }
    stage("Testing"){
        echo 'Testing..'
    }
    stage("Deploying "){
        echo 'Deploying....'
    }
    stage("Send Notification to Slack"){
        slackend color: '#BADA55', message: 'Hello, World!'
    }
}
