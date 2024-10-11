import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.VideoView
import com.example.fitness.R

class TrainerAdapter(private val context: Context, private val videoList: List<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return videoList.size
    }

    override fun getItem(position: Int): Any {
        return videoList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.trainer, parent, false)
        val videoView: VideoView = view.findViewById(R.id.videotrain)

        // Остановка предыдущего видео, если оно было запущено
        if (videoView.isPlaying) {
            videoView.stopPlayback()
        }

        // Установка источника видео
        videoView.setVideoPath(videoList[position])

        // Опционально: для предотвращения постоянного воссоздания, можно установить слушателя для завершения
        videoView.setOnCompletionListener {
            // Действие при завершении воспроизведения (например, перезапуск или остановка)
            videoView.stopPlayback()
        }

        // Важно: вы можете добавить управление воспроизведением за пределами getView
        // Если элемент становится видимым, запускайте видео,
        // иначе останавливайте его, когда элемент становится невидимым

        // Примечание: управление видимостью может быть реализовано в getView на основе других условий или в классе активности/фрагмента.

        return view
    }

}
