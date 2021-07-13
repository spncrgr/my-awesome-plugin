package com.github.spncrgr.myawesomeplugin.services

import com.github.spncrgr.myawesomeplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
