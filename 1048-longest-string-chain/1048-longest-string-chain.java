class Solution {
public int longestStrChain(String[] words) {
        
	if(words == null || words.length == 0) return 0;
	int res = 0;
	Arrays.sort(words, (a,b)-> a.length()-b.length());  // Sort the words based on their lengths
	HashMap<String, Integer> map = new HashMap();       //Stores each word and length of its max chain.

	for(String w : words) {                             //From shortest word to longest word
		map.put(w, 1);                                  //Each word is atleast 1 chain long
		for(int i=0; i<w.length(); i++) {               //Form next word removing 1 char each time for each w
			StringBuilder sb = new StringBuilder(w);
			String next = sb.deleteCharAt(i).toString();
			if(map.containsKey(next) && map.get(next)+1 > map.get(w))
				map.put(w, map.get(next)+1);            //If the new chain is longer, update the map
		}
		res = Math.max(res, map.get(w));                //Store max length of all chains
	}
	return res;
}
}