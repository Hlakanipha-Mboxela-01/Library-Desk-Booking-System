package creational_patterns;

class Room {
    private String name;
    private int floor;
    private boolean hasWhiteboard;

    private Room(RoomBuilder builder) {
        this.name = builder.name;
        this.floor = builder.floor;
        this.hasWhiteboard = builder.hasWhiteboard;
    }

    public static class RoomBuilder {
        private String name;
        private int floor;
        private boolean hasWhiteboard;

        public RoomBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public RoomBuilder setFloor(int floor) {
            this.floor = floor;
            return this;
        }

        public RoomBuilder setWhiteboard(boolean hasWhiteboard) {
            this.hasWhiteboard = hasWhiteboard;
            return this;
        }

        public Room build() {
            return new Room(this);
        }
    }

    public void display() {
        System.out.println("Room: " + name + ", Floor: " + floor + ", Whiteboard: " + hasWhiteboard);
    }
}
