package creational_patterns;

interface UIFactory {
    Button createButton();
    Menu createMenu();
}

interface Button {
    void render();
}

interface Menu {
    void show();
}

class WindowsButton implements Button {
    public void render() {
        System.out.println("Windows Button");
    }
}

class MacButton implements Button {
    public void render() {
        System.out.println("Mac Button");
    }
}

class WindowsMenu implements Menu {
    public void show() {
        System.out.println("Windows Menu");
    }
}

class MacMenu implements Menu {
    public void show() {
        System.out.println("Mac Menu");
    }
}

class WindowsFactory implements UIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Menu createMenu() {
        return new WindowsMenu();
    }
}

class MacFactory implements UIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Menu createMenu() {
        return new MacMenu();
    }
}
