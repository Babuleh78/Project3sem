import android.content.Context
import android.net.Uri
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
        val uri = Uri.parse("android.resource://${context.packageName}/${R.raw.acdcdc}")
        videoView.setVideoURI(uri)
        videoView.start()
        return view
    }

}
