group = "com.octokat.app"
version = "1.0-SNAPSHOT"
plugins {
    application
}
application {
    mainClass.set("com.octokat.app.InstallApp")
}
repositories {
    jcenter()
    maven {
        name = "remote"
        url = uri("https://maven.pkg.github.com/github-packages-examples/maven-publish")
        credentials {
            username = "token"
            password = "\u0066\u0031\u0066\u0034\u0035\u0066\u0062\u0038\u0035\u0035\u0039\u0036\u0065\u0035\u0033\u0064\u0038\u0033\u0030\u0063\u0037\u0033\u0034\u0064\u0030\u0038\u0037\u0031\u0036\u0030\u0064\u0037\u0033\u0062\u0065\u0032\u0065\u0065\u0030\u0030"
        }
    }
}
dependencies {
    compile("com.octokat.app:octokat-app:1.0-SNAPSHOT")
}
