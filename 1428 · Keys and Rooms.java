// 230ms ( 83.81% ) 17.29mb

public class Solution {
    /**
     * @param rooms: a list of keys rooms[i]
     * @return: can you enter every room
     */
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        // Write your code here
        Set<Integer> opened = new HashSet();
        Queue<Integer> queue = new LinkedList();
        opened.add(0);
        queue.add(0);
        
        while(!queue.isEmpty()) {
            int index = queue.poll();
            for (int key : rooms.get(index)) {
                if (!opened.contains(key)) {
                    opened.add(key);
                    queue.add(key);
                }
            }
        }
        return opened.size() == rooms.size();
    }
}