import java.util.*;
public class MotorbikeTest
{
    static Scanner sc = new Scanner(System.in);
    public static void inputMotorbike (ArrayList<Motorbike> motorbikes, int n)
	{
        for(int i = 0; i < n; i++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            String manu = sc.nextLine();
            int quantity = Integer.parseInt(sc.nextLine());
            double price = Double.parseDouble(sc.nextLine());
            double weigth = Double.parseDouble(sc.nextLine());
            String date = sc.nextLine();
            Motorbike m  = new Motorbike(id,name,manu,quantity,price,weigth,date);
            motorbikes.add(m);
        }
	}
	public static void ouputMotorbike (ArrayList<Motorbike> motorbikes)
	{
        for(int i = 0; i < motorbikes.size(); i++){
            motorbikes.get(i).printMotorbike();
        }
		
	}
	public static ArrayList<Motorbike> search (String manu, ArrayList<Motorbike> motorbikes)
	{
        ArrayList<Motorbike> result = new ArrayList<Motorbike> ();
		for(int i = 0; i < motorbikes.size(); i++){
            if(motorbikes.get(i).getManu().equals(manu)) {
                result.add(motorbikes.get(i));
            }
        }
        return result;
	}
	public static ArrayList<Motorbike> maxWeight (ArrayList<Motorbike> motorbikes)
	{
        double maxW = -1;
        ArrayList<Motorbike> result = new ArrayList<Motorbike> ();
        for(int i = 0; i < motorbikes.size(); i++){
            if(motorbikes.get(i).getWeight() > maxW) {
                maxW = motorbikes.get(i).getWeight();
            }
        }
        for(int i = 0; i < motorbikes.size(); i++){
            if(motorbikes.get(i).getWeight() == maxW) {
                result.add(motorbikes.get(i));
            }
        }
        return result;
	}
	public static ArrayList<Motorbike> minQuanlity (ArrayList<Motorbike> motorbikes)
	{
        int minQ = Integer.MAX_VALUE;
        ArrayList<Motorbike> result = new ArrayList<Motorbike> ();
		for(int i = 0; i < motorbikes.size(); i++){
            if(motorbikes.get(i).getQuantity() < minQ) {
                minQ = motorbikes.get(i).getQuantity();
            }
        }
        for(int i = 0; i < motorbikes.size(); i++){
            if(motorbikes.get(i).getQuantity() == minQ) {
                result.add(motorbikes.get(i));
            }
        }
        return result;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(sc.nextLine()); //doc het 1 dong roi cho con tro xuong dong de doc dong tiep theo
        ArrayList<Motorbike> motorbikes = new ArrayList <Motorbike>();
        inputMotorbike(motorbikes,n);
        int c = Integer.parseInt(sc.nextLine());
        if(c == 1) {
            ouputMotorbike(search("Honda", motorbikes));
        }
        if(c == 2) {
            ouputMotorbike(maxWeight(motorbikes));
        }
        if(c == 3) {
            ouputMotorbike(minQuanlity(motorbikes));
        }
	}
} 