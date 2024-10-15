import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import com.example.fitness.OnProductClickListener
import com.example.fitness.R
import com.example.fitness.ui.theme.Product
import com.example.fitness.ui.theme.TarifAdapter
import com.example.fitness.ui.theme.TarifAdapter.TarifViewHolder
import kotlinx.coroutines.NonDisposableHandle.parent

class ProductAdapter(private val context: Context, private val productList: List<Product>, private val listener: OnProductClickListener) : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.product_image)
        val buttonAddToCart: Button = itemView.findViewById(R.id.button_product) // указатель на кнопку
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        if (position >= 0 && position < productList.size) {
            val currentProduct = productList[position]
            holder.image.setImageResource(currentProduct.imageResId)

            // Обработчик нажатия на кнопку
            holder.buttonAddToCart.setOnClickListener {
                listener.onProductClick(currentProduct)
            }
        }
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}
