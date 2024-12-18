class Account {
    private String name;// имя автора
    private String tekst; // текст автора
    private int like;// количество лайков

    public Account(String name, String tekst, int like) {
        if (name.length() != 0)
            this.name = name;
        if (tekst.length() <= 70)
            this.tekst = tekst;
        this.like = like;
    }

    public void addLike() {
        like += 1;
    }

    public int getLike() {
        return like;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return ("автор: "+name+"\nтекст: "+tekst+"\nколичество лайков: "+like+"\n");

    }
}