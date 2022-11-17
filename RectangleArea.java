class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int areaOfRectangle1=(ax2-ax1)*(ay2-ay1);
        int areaOfRectangle2=(bx2-bx1)*(by2-by1);

        int ax1NewCoordinate = Math.max(ax1,bx1);
        int ay1NewCoordinate = Math.max(ay1,by1);
        int bx1NewCoordinate = Math.min(ax2,bx2);
        int by1NewCoordinate = Math.min(ay2,by2);

        int newRectX = bx1NewCoordinate - ax1NewCoordinate;
        int newRectY = by1NewCoordinate - ay1NewCoordinate;

        int areaNewRect = newRectX*newRectY;
        if(newRectX < 0  || newRectY < 0)
        {
            areaNewRect=0;
        }
        return areaOfRectangle1 + areaOfRectangle2 - areaNewRect;
    }
}