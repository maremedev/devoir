 public class Domino{
 private int left;
 private int right;
 public Domino (int i, int j){
    this.left=i;
    this.right=j;
 } 
 public Domino(){
    this.left=0;
    this.right=0;
 } 
 public int getLeft(){
    return left;
 } 
 public int getRight() {
    return right;
}
 public boolean isDomino(){
      return (left >= 0 && left <= 6) && (right >= 0 && right <= 6);
 } 
 public boolean isDouble(){
   return left == right;
 } 
 public int totalPoint(){
      return left + right;
 } 
 public void rotate(){
    int temp = left;
        left = right;
        right = temp;
 } 
 public String toString(){
       return "" + left + "|" + right + "";
 } 
 public int compareTo(Domino d){
     return Integer.compare(this.totalPoint(), d.totalPoint());
 }
 }