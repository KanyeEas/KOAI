const AC_GAME_OGBJECTS = [];

export class AcGameObject {
    constructor() {
        AC_GAME_OGBJECTS.push(this);
        this.timedelta = 0;
        this.has_called_start = false;
    }

    start() { // execute only once

    }

    update() { // execute every frame, except first frame (start())

    }

    on_destroy() { // execute before destroy

    }

    destroy() {
        this.on_destroy();

        for (let i in AC_GAME_OGBJECTS) {
            const obj = AC_GAME_OGBJECTS[i];
            if (obj === this) {
                AC_GAME_OGBJECTS.splice(i);
                break;
            }
        }
    }
}

let last_timestamp;
const step = timestamp => {
    for (let obj of AC_GAME_OGBJECTS) {
        if (!obj.has_called_start) {
            obj.has_called_start = true;
            obj.start();
        } else {
            obj.timedelta = timestamp - last_timestamp;
            obj.update();
        }
    }

    last_timestamp = timestamp;
    requestAnimationFrame(step)
}

requestAnimationFrame(step)