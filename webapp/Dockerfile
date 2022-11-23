FROM node:16

WORKDIR /usr/src/app/app-ui

COPY package*.json ./

EXPOSE 4200

RUN npm install -g @angular/cli @angular-devkit/build-angular && npm install

CMD ["npm", "run", "--", "ng", "serve", "--host", "0.0.0.0", "--disable-host-check"]
