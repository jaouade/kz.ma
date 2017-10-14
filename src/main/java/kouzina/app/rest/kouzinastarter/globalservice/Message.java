package kouzina.app.rest.kouzinastarter.globalservice;



/**
 * Created by kel on 04/10/17.
 */
public interface Message {
    final  class Success{
        String message;
        Object object;

        public Success(String message, Object object) {
            this.message = message;
            this.object = object;
        }

        public String getMessage() {
            return message;
        }

        public Success setMessage(String message) {
            this.message = message;
            return this;
        }

        public Object getObject() {
            return object;
        }

        public Success setObject(Object object) {
            this.object = object;
            return this;
        }
    }
    final  class Error{
        String message;
        Object object;

        public Error(String message, Object object) {
            this.message = message;
            this.object = object;
        }

        public String getMessage() {
            return message;
        }

        public Error setMessage(String message) {
            this.message = message;
            return this;
        }

        public Object getObject() {
            return object;
        }

        public Error setObject(Object object) {
            this.object = object;
            return this;
        }
    }
}
