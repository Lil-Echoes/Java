package ch11;

class FruitBox2<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public T pullOut() {
		return item;
	}
}

public class FruitBox2Ex {
public static void main(String[] args) {
		
		FruitBox2<Orange> fb = new FruitBox2<>();
		
		fb.store(new Orange(10));
		Orange og1 = (Orange)fb.pullOut();
		og1.showSugar();
		
//		Generics 사용했더니 오렌지가 아닌 것을 담으면 바로 에러
//		개발할 때 에러를 미리 고칠 수 있다
//		fb.store(new Apple(8));
//		Orange og2 = (Orange)fb.pullOut();
//		og2.showSugar();
	}

}
