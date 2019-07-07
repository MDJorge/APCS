public class SortedWordList extends java.util.ArrayList<String>
{
    public SortedWordList() {
        super();
    }
    
    public SortedWordList(int i) {
        super(i);
    }
    
    public boolean contains(String word) {
        return this.indexOf(word) != -1;
    }
    
    public int indexOf(String word) {
        int start = 0, middle = 0;
        int end = this.size() - 1;
        
        while(start <= end) {
            middle = (start + end) / 2;
            
            if(word.compareToIgnoreCase(this.get(middle)) < 0) {
                end = middle-1;
            } else if(word.compareToIgnoreCase(this.get(middle)) > 0) {
                start = middle+1;
            } else {
                return middle;
            }
        }
        
        return -1;
    }
    
    public String set(int i, String word) {        
        if((i < size()-1  &&  word.compareToIgnoreCase(this.get(i+1)) >= 0 || i == 0)
            && (i > 0  &&  word.compareToIgnoreCase(this.get(i-1)) <= 0 || i == 0)) {
                return super.set(i, word);
        } else {
                throw new IllegalArgumentException("word=" + word + " i=" + i);
        }
    }
    
    public void add(int i, String word) {
        if ( ( i < this.size() - 1 && word.compareToIgnoreCase(get(i+1)) >= 0)
        || ( i > 0 && word.compareToIgnoreCase(get(i-1)) <= 0 )) {
                throw new IllegalArgumentException("word=" + word + " i=" + i);
        }

        super.add(i, word);
    }
    
    public boolean add(String word) {
        int start = 0, middle = 0;
        int end = this.size();
        
        while(start < end) {
            middle = (start + end) / 2;
            
            if(word.compareToIgnoreCase(get(middle)) < 0) {
                end = middle;
            } else if(word.compareToIgnoreCase(get(middle)) > 0) {
                start = middle+1;
            } else {
                return false;
            }
        }
        
        super.add(end, word);
        
        return true;
    }
    
    public void merge(SortedWordList additionalWords) {
        for(String word : additionalWords) {
            add(word);
        }
    }
}
