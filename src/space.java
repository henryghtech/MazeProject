public class space {
    private final int row;
    private final int col;
    private final boolean start;
    private final boolean end;
    private final boolean open;
    private final boolean closed;

    private final space[] spaces = new space[4];
    private int count = 0;
    private boolean visited;
    private boolean path;

    public space(int row, int col, boolean start, boolean end, boolean open, boolean closed ) {
        this.row = row;
        this.col = col;
        this.start = start;
        this.end = end;
        this.open = start;
        this.closed = end;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isStart() {
        return start;
    }

    public boolean isEnd() {
        return end;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isClosed() {
        return closed;
    }

    public boolean isVisited() {
        return visited;
    }

    public boolean isPath() {
        return path;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void setPath(boolean path) {
        this.path = path;
    }

    public boolean isWalkable() {
        return !closed;
    }
}
