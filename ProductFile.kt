import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness.R
import com.example.fitness.ui.theme.Product

class ProductAdapter(private val productList: List<Product>) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    // ViewHolder для элемента списка
    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.product_image)
        //val textView: TextView = itemView.findViewById(R.id.product_name)
    }

    // Создание ViewHolder и соответствия его макету
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product, parent, false)
        return ProductViewHolder(view)
    }

    // Привязка данных к элементам представления
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]
        holder.imageView.setImageResource(product.imageResId)
        //holder.textView.text = product.productName
    }

    // Общее количество элементов
    override fun getItemCount(): Int {
        return productList.size
    }
}
