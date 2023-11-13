import android.provider.BaseColumns

object VideoContract {
    class VideoEntry : BaseColumns {
        companion object {
            const val TABLE_NAME = "videos"
            const val COLUMN_ID = BaseColumns._ID
            const val COLUMN_NAME = "name"
            const val COLUMN_THUMBNAIL = "thumbnail"
            const val COLUMN_UPLOAD_TIME = "upload_time"
            const val COLUMN_DURATION = "duration"
            const val COLUMN_RESOLUTION = "resolution"
        }
    }
}
