import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class VideoDatabaseHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "video.db"
        const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        val CREATE_VIDEO_TABLE = ("CREATE TABLE " +
                VideoContract.VideoEntry.TABLE_NAME + "(" +
                VideoContract.VideoEntry.COLUMN_ID + " INTEGER PRIMARY KEY," +
                VideoContract.VideoEntry.COLUMN_NAME + " TEXT," +
                VideoContract.VideoEntry.COLUMN_THUMBNAIL + " BLOB," +
                VideoContract.VideoEntry.COLUMN_UPLOAD_TIME + " INTEGER," +
                VideoContract.VideoEntry.COLUMN_DURATION + " INTEGER," +
                VideoContract.VideoEntry.COLUMN_RESOLUTION + " TEXT" + ")")
        db.execSQL(CREATE_VIDEO_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS " + VideoContract.VideoEntry.TABLE_NAME)
        onCreate(db)
    }
}
