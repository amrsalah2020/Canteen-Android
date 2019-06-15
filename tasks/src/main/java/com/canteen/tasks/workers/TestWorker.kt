package com.canteen.tasks.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.canteen.tasks.di.ChildWorkerFactory
import com.squareup.inject.assisted.Assisted
import com.squareup.inject.assisted.AssistedInject

/**
 * Created by Amr Salah on 5/20/2019.
 */


class TestWorker @AssistedInject constructor(
    @Assisted params: WorkerParameters,
    @Assisted context: Context
) : CoroutineWorker(context, params) {

    companion object {
        private const val TAG = "TestWorker"
    }


    override suspend fun doWork(): Result {
        return Result.success()
    }


    @AssistedInject.Factory
    interface Factory : ChildWorkerFactory

}