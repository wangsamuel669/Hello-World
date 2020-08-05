package xyz.samuel.service;

public class QuickFind implements FindUnion {

    private int[] points;
    int count = 0;

    @Override
    public void init(int n) {
        points = new int[n];
        for (int i = 0; i < n; i++) {
            points[i] = i;
        }
        count = n;
    }

    @Override
    public void union(int p, int q) {
        if (points[p] == points[q]) {
            return;
        }
        int name = points[q];
        int replaceName = points[p];
        for (int i = 0; i < points.length; i++) {
            if (points[i] == name) {
                points[i] = replaceName;
            }
        }
        count--;
    }

    @Override
    public int find(int p) {
        return points[p];
    }

    @Override
    public boolean connected(int p, int q) {
        return false;
    }

    @Override
    public int size() {
        return count;
    }
}
