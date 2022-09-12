 
listView('BGBGBGBGBGBGB3 Jobs') {
    description('BGBGBGBGBGBGB3 Jobs')
    jobs {
        regex('BGBGBGBGBGBGB3_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
