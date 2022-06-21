class Solution {
 public int furthestBuilding(int[] heights, int bricks, int ladders) {
var n=heights.length;
var pq=new PriorityQueue<Integer>();
for(int i=1;i<n;i++)
{
var climbs=heights[i]-heights[i-1];
if(climbs<=0)
continue;//skip
pq.add(climbs);
if(pq.size()<=ladders)
continue;
if((bricks-=pq.poll())<0)
return i-1;

}
return n-1;
}
}