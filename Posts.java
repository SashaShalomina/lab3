class Posts{
    private Account [] data = new Account[1000];

    public Posts ( Account [] people) {
        int k = people.length;
        for (int i = k-1; i >=0; i--) {
            data[i] = people[k-1-i];
        }
    }

    public void addPerson(Account person){
        Account t = data[0];
        for (int i = 1; i < data.length; i++) {
            Account tt= data[i];
            data[i]=t;
            t=tt;
        }
        data[0]=person;
    }

    public int getLikeofPerson(int t ){
        return data[t-1].getLike();
    }

    public void addLiketoPerson (int t){
        data[t-1].addLike();
    }

    public void delitePost( int t ){
        for (int i = t-1; i < data.length-1 ; i++) {
            data[i]=data[i+1];
        }
        data[data.length-1]=null;
    }

    public void moreLikethen(int t ){
        for (int i = 0; i < data.length; i++) {
            if (data[i]!=null){
                if (data[i].getLike()>t )
                    System.out.println(data[i]);
            }

        }
    }

    public Account themostPopularPost(){
        Account t = data[0];
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]!=null){
                if (data[i].getLike()>max){
                    max=data[i].getLike();
                    t=data[i];
                }
            }
        }
        return t;
    }

    public void postwithSemiA(String name){
        for (int i = 0; i < data.length; i++) {
            if (data[i]!=null){
                if (data[i].getName().equals(name))
                    System.out.println(data[i]);
            }

        }
    }

    public void deliteAforN(String name,int t){
        int kol=0;
        int index = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i]!=null){
                if (data[i].getName().equals(name)){
                    kol++;
                    if (kol==t){
                        index=i;
                    }


                }
            }
        }
        for (int i = index; i < data.length-1; i++) {
            data[i]=data[i+1];
        }
        data[data.length-1]=null;
    }

    public void deliteAvtor(String name){
        int reskol=0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                if (data[i].getName().equals(name)) {
                    data[i] = null;
                    reskol++;
                }
            }
        }
        for (int i = 0; i < reskol; i++) {
            int kol=0;
            int index= data.length;
            for (int j = 0; j < data.length-1; j++) {
                if (data[j]==null && kol==0){
                    kol++;
                    index=j;}
                if (j>=index)
                    data[j]=data[j+1];
            }
        }
    }

    public int sumLikeofAvtor(String name){
        int sum=0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]!=null){
                if (data[i].getName().equals(name)){
                    sum+=data[i].getLike();
                }
            }
        }
        return sum;
    }

    public String allAvtors(){
        String s = "";
        for (int i = 0; i < data.length ; i++) {
            if (data[i] != null) {
                int kol = 0;
                for (int j = i - 1; j >=0; j--) {
                    if (data[j] != null)
                        if (data[i].getName().equals(data[j].getName()))
                            kol++;
                }
                if (kol == 0)
                    s += data[i].getName() + "\n";
            }
        }
        return s;
    }

    public String theMostPopularAvtor(){
        int maxsum=0;
        Account best = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                int max = 0;
                for (int j = 0; j < data.length; j++) {
                    if (data[j] != null) {
                        if (data[j].getName().equals(data[i].getName())) {
                            max += data[j].getLike();
                        }
                    }
                }
                if (max > maxsum) {
                    maxsum = max;
                    best = data[i];
                }
            }
        }
        return best.getName();
    }

    @Override
    public String toString(){
        String s ="";
        int kol=0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]!=null)
                s+=data[i]+"\n";
            else
                kol++;
        }
        return String.format(s+"%d (из %d) постов можно еще разместить\n",kol,data.length);
    }

}