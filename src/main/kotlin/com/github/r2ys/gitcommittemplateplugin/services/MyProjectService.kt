package com.github.r2ys.gitcommittemplateplugin.services

import com.github.r2ys.gitcommittemplateplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
