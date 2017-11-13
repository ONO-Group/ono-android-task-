package cz.ackee.cookbook

import android.app.Application
import android.content.Context

/**
 * Main application class
 */
class App : Application() {

    companion object {
        val TAG = App::class.java.name

        private var context: Context? = null
    }

    override fun onCreate() {
        super.onCreate()

        App.context = applicationContext

        // TODO initialize other libraries here
    }
}
