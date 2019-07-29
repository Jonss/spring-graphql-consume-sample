package br.com.jonss.graphqlconsume.domain;

public class GraphqlData {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GraphqlData{" +
                "data=" + data +
                '}';
    }
}
