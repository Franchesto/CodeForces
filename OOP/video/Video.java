package video;

public class Video implements acoesVideo {
        private String titulo;
        private int avaliacao;
        private int views;
        private int likes;
        private boolean repruduzindo;

        public Video(String titulo){
            this.titulo = titulo;
            this.avaliacao = 1;
            this.views = 0;
            this.likes = 0;
            this.repruduzindo = false;
        }

        public int getAvaliacao() {
            return avaliacao;
        }
        public int getLikes() {
            return likes;
        }
        public String getTitulo() {
            return titulo;
        }
        public int getViews() {
            return views;
        }
        public void setAvaliacao(int avaliacao) {
               int nova = (this.avaliacao + avaliacao)/this.getViews(); 
               this.avaliacao = nova;
        }
        public void setLikes(int likes) {
            this.likes = likes;
        }
        public void setRepruduzindo(boolean repruduzindo) {
            this.repruduzindo = repruduzindo;
        }
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
        public void setViews(int views) {
            this.views = views;
        }
        @Override
        public void play() {
            this.repruduzindo = true;
        }
        @Override
        public void pause() {
            this.repruduzindo = false;
        }
        @Override
        public void like() {
               setLikes(getLikes()+1);
        }

}
