package xyz.samuel.service;

public interface FindUnion {
    void init(int n);

    void union(int p, int q);

    int find(int p);

    boolean connected(int p, int q);

    int size();
}
