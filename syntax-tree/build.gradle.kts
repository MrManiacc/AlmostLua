import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

sourceSets["main"].java.srcDir("src/main/antlr")
//Mark src/main/antlr as a generated source directory with idea plugin

idea {
    module {
        this.generatedSourceDirs.add(this.project.file("src/main/antlr"))
    }
}


dependencies {
    implementation("org.antlr:antlr4-runtime:4.12.0")
}