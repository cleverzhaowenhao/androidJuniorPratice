package RecyclerView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruit();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }

    private void initFruit() {
        for (int i = 0; 1 < 2; i++) {
            Fruit apple = new Fruit("apple", R.drawable.ic_launcher_background);
            fruitList.add(apple);
            Fruit banana = new Fruit("banana", R.drawable.ic_launcher_background);
            fruitList.add(banana);
            Fruit orange = new Fruit("orange", R.drawable.ic_launcher_background);
            fruitList.add(orange);
            Fruit watermelon = new Fruit("watermelon", R.drawable.ic_launcher_background);
            fruitList.add(watermelon);
            Fruit pear = new Fruit("pear", R.drawable.ic_launcher_background);
            fruitList.add(pear);
            Fruit grape = new Fruit("grape", R.drawable.ic_launcher_background);
            fruitList.add(grape);
            Fruit pineapple = new Fruit("pineapple", R.drawable.ic_launcher_background);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit("strawberry", R.drawable.ic_launcher_background);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit("cherry", R.drawable.ic_launcher_background);
            fruitList.add(cherry);
            Fruit mango = new Fruit("mango", R.drawable.ic_launcher_background);
            fruitList.add(mango);

        }
    }
}
